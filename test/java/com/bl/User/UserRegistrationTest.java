package com.bl.User;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration user = new UserRegistration();

	@Test
	public void givenFirstName_ifProper_ShouldReturnTrue() {
		boolean value = user.nameValidation("Mounika");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenFirstName_ifProper_ShouldReturnFalse() {
		boolean value = user.nameValidation("mounika");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean value = user.lastNameValidation("Avula");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnFalse() {
		boolean value = user.lastNameValidation("av");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean value = user.emailValidation("mouni@gmail.com");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnFalse() {
		boolean value = user.emailValidation("mounigmail.com");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenPhone_WhenProper_ShouldReturnTrue() {
		boolean value = user.phoneNumberValidation("91 9876543210");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPhone_WhenProper_ShouldReturnFalse() {
		boolean value = user.phoneNumberValidation("919876543210");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean value = user.passwordValidation("Mouni@11");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean value = user.passwordValidation("mouni12");
		Assert.assertEquals(false, value);
	
	}
	
}