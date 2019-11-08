package Packtwo;

import org.testng.Assert;
import org.testng.annotations.Test;
import Packone.BasePage;
import Packone.HomePageObjects;

	public class HomePageTest {
		
		HomePageObjects homePage;
		
		public HomePageTest(){
			homePage = new HomePageObjects();
		}
		
		@Test
		public void veerifyTabNavigation() {
			homePage.clickwomen();
			Assert.assertTrue(homePage );
		}
			
		
		

}
