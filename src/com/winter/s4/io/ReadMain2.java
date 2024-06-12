package com.winter.s4.io;

import java.util.List;

import com.winter.s4.io.ex1.MenuDTO;
import com.winter.s4.io.ex1.ReadStudy;

public class ReadMain2 {

	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			List<MenuDTO> list = rs.read();
			for (MenuDTO menuDTO : list) {
				System.out.println(menuDTO.getMenuName());
				System.out.println(menuDTO.getPrice());
				System.out.println(menuDTO.getKcal());
				System.out.println("==================");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
