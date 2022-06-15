package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		ActionInsert insert = new ActionInsert();
		ActionSelect select = new ActionSelect();
		ActionUpdate update = new ActionUpdate();
		ActionDelete delete = new ActionDelete();

		while (true) {
			System.out.println("�������� �Է��ϼ��� insert, select, update, delete");
			String query = scn.next();
			if (query.equals("insert")) {
				insert.excuteQuery();
			} else if (query.equals("select")) {
				select.excuteQuery();
			} else if (query.equals("update")) {
				update.excuteQuery();
			} else if (query.equals("delete")) {
				delete.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}

		scn.close();

	}
}
