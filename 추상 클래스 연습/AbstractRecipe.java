package com.recipe;

public abstract class AbstractRecipe {
	void execute() {
		prepare();
		recipe();
		cleanup();
	}

	abstract void prepare();

	abstract void recipe();

	abstract void cleanup();
}
