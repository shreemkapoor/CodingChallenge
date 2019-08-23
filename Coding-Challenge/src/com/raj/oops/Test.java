package com.raj.oops;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Child {
int i = 10;
static int staici = 10;
public void show()
{
 System.out.println("Mehodd Show");	
}
}

public class Test {
	public static void main(String[] args) {
		Child child = new Child();
		@SuppressWarnings("rawtypes")
		Class c1 = child.getClass();
		Method method[] = c1.getDeclaredMethods();
		for (Method method2 : method) {
			System.out.println("Methods " + method2);
			System.out.println("Methods " + method2);
		}
		Field fields[] = c1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println(String.class.getClass());
		System.out.println(String.class.getClasses());
		System.out.println(Child.class.getClassLoader());
		

	}
}
