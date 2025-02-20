package xom.shop.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.persist.Categories;
import xom.shop.persist.Product;
import xom.shop.service.Admin_EditorService;
import xom.shop.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminControlller {

	@Autowired
	ProductService productService;
	@Autowired
	Admin_EditorService adminService;

	// Show add product form
	@RequestMapping(value = "/addProductForm", method = RequestMethod.GET)
	public ModelAndView addProductForm(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Categories());
		model.addAttribute("categories", adminService.getListCategory());
		return new ModelAndView("product/addProduct");
	}

	// Add new product with image handling
	@RequestMapping(method = RequestMethod.POST, value = "/addProduct")
	public ModelAndView addProduct(@ModelAttribute("product") Product product,
			@ModelAttribute("category") Categories category, @RequestParam("image") MultipartFile[] imageFile,
			Model model, HttpServletRequest req) throws IOException {
		String uploadPath = "D:\\Ananta\\Formals\\Pro_Wings\\Java_Workspaces\\Java_10_WorkSpace\\Shop\\src\\main\\webapp\\resources\\imagess\\product";
		// Create the directory if it doesn't exist
		File directory = new File(uploadPath); // Create the directory if it doesn't exist
		if (!directory.exists()) {
			directory.mkdirs();
		}
		String allimageUrl = "";
		for (MultipartFile file : imageFile) {
			if (!file.isEmpty()) {
				String imageFileName = file.getOriginalFilename(); // Get the original file name
				// Define the path where the image will be saved
				String imageFilePath = uploadPath + File.separator + imageFileName;
				allimageUrl = allimageUrl + "," + imageFileName;
				try (FileOutputStream fos = new FileOutputStream(imageFilePath)) { // Save the image to the file system
					fos.write(file.getBytes());
				}
			}
		}
		product.setImage_url(allimageUrl); // Set the image file name to the product entity
		product.setCategory(category); // Set the category to the product
		productService.saveAndGetProduct(product); // Save the product to the database
//		model.addAttribute("product", newProduct);
		return new ModelAndView("redirect:/admin/addProductForm");
	}
}