package com.alchitry.labs.boards;

public class MojoV2 extends Board {

	@Override
	public String getFPGAName() {
		return "xc6slx9-2tqg144";
	}

	@Override
	public String getName() {
		return "Mojo V2";
	}

	@Override
	public String getBaseProjectName() {
		return "mojo-v2";
	}

	@Override
	public String getAVRName() {
		return "atmega16u4";
	}

	@Override
	public String getHexFile() {
		return "mojo-v2-loader.hex";
	}

}
