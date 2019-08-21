package Fpt;

import java.util.ArrayList;
import java.util.Collections;

public class MainQuestion {
		public static void main(String[] args) {
			System.out.println(" Cau hoi: ");
			ArrayList<String> question = new ArrayList<String>();
			question.add("1. Vi sao nuoc bien man ?");
			question.add("2. Con cho co may chan ?");
			question.add("3. Xe may co may banh ?");
			question.add("4. Con vit co may chan ?");
			question.add("5. Vi sao bi hoi ?");
			
			for(int i = 0; i < 5;i++) {
				System.out.println(question.get(i).toString());
			}
			
			System.out.println(" Xao tron cau hoi:");
			Collections.shuffle(question);
			for(int i = 0; i < 5;i++) {
				System.out.println(question.get(i).toString());
			}
		}
}
