package com.rxmg.utils;

import com.rxmg.base.DriverScript;

public class Helper extends DriverScript {
		 public static void fn_sleep()
		 {
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }

}
