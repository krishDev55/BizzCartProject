package xom.shop.persist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Editor {
	@Id
	int editor_id;
	String passkey;
	boolean flag;

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getEditor_id() {
		return editor_id;
	}

	public void setEditor_id(int editor_id) {
		this.editor_id = editor_id;
	}

	public String getPasskey() {
		return passkey;
	}

	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}

	@Override
	public String toString() {
		return "Editor [editor_id=" + editor_id + ", passkey=" + passkey + "]";
	}

	public Editor() {
		System.out.println("This is Editor");
	}

}
