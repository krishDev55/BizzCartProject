package xom.shop.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import xom.shop.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminControlller {

	@Autowired
	ProductService productService;

	// Show add product form
	@RequestMapping(value = "/addProductForm", method = RequestMethod.GET)
	public ModelAndView addProductForm(Model model) {
		Product product = new Product();
		Categories category = new Categories();
		model.addAttribute("product", product);
		model.addAttribute("category", category);
		return new ModelAndView("product/addProduct");
	}

	// Add new product with image handling
	@RequestMapping(method = RequestMethod.POST, value = "/addProduct")
	public ModelAndView addProduct(@ModelAttribute("product") Product product,
			@ModelAttribute("category") Categories category, @RequestParam("image") MultipartFile imageFile,
			Model model, HttpServletRequest req) throws IOException {

		// Handle the image file upload
		if (!imageFile.isEmpty()) {
			// Get the original file name
			String imageFileName = imageFile.getOriginalFilename();

			// Define the path where the image will be saved
			String uploadPath = "D:\\Ananta\\Formals\\Pro_Wings\\Java_Workspaces\\Java_10_WorkSpace\\Shop\\src\\main\\webapp\\imagess";
			String imageFilePath = uploadPath + File.separator + imageFileName;

			// Create the directory if it doesn't exist
			File directory = new File(uploadPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}

			// Save the image to the file system
			try (FileOutputStream fos = new FileOutputStream(imageFilePath)) {
				fos.write(imageFile.getBytes());
			}

			// Set the image file name to the product entity
			product.setImage_url(imageFileName);
		}

		// Set the category to the product
		product.setCategory(category);

		// Save the product to the database
		Product newProduct = productService.saveAndGetProduct(product);
		model.addAttribute("product", newProduct);

		// Redirect to the product form after saving
		return new ModelAndView("redirect:/admin/addProductForm");
	}
}