package com.tdameritrade.tests.homePageTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.tdameritrade.tests.TestBase;

import utilities.TDBrokenLinksUtil;

public class ValidateAllLinksTdAmeritrade extends TestBase{
	
		@Test
		public void validateLinks() {
				
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
				System.out.println("Total links are " + links.size());
				
				for(int i=0;i<links.size();i++) {
					WebElement element = links.get(i);
					String urlString = element.getAttribute("href");
					TDBrokenLinksUtil.verifyingActiveLinks(urlString);
					
				}
			}
			}

