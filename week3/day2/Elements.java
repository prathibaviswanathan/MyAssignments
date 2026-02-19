package week3.day2;

public class Elements extends Button {
	 public static void main(String[] args) {
	        
	        // Using Button
	        Button button = new Button();
	        button.click();
	        button.submit();
	        
	        System.out.println("----------------");
	        
	        // Using TextField
	        TextField textField = new TextField();
	        textField.setText("Hello World");
	        System.out.println("Retrieved Text: " + textField.getText());
	        
	        System.out.println("----------------");
	        
	        // Using CheckBoxButton
	        CheckBoxButton checkBox = new CheckBoxButton();
	        checkBox.click();
	        checkBox.submit();
	        checkBox.clickCheckButton();
	        
	        System.out.println("----------------");
	        
	        // Using RadioButton
	        RadioButton radioButton = new RadioButton();
	        radioButton.click();
	        radioButton.submit();
	        radioButton.selectRadioButton();
	        
	        System.out.println("----------------");
	        
	        // Using Elements class (inherits Button)
	        Elements elements = new Elements();
	        elements.click();
	        elements.submit();
	    }
	}


