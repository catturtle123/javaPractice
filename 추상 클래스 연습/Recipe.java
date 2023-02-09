package com.recipe;

public class Recipe extends AbstractRecipe {

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare");

	}

	@Override
	void recipe() {
		// TODO Auto-generated method stub
		System.out.println("recipe");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("cleanup");
	}

}
