package jp.co.nts.logic;

public class Sample {

	public static class Director {
		private Builder builder;
		
		public Director(Builder builder) {
			this.builder = builder;
		}
		
		public Car construct() {
			builder.makeHandle();
			builder.makeDoor();
			builder.makeMirror();
			return builder.build();
		}
	}
	
	public static interface Builder {
		public void makeHandle();
		public void makeDoor();
		public void makeMirror();
		public Car build(); 
	}
	
	public static class No1Builder implements Builder {
		private Car car;

		public No1Builder() {
			car = new Car();
		}
		
		@Override
		public void makeHandle() {
			car.setHandle("no1Handle");
		}

		@Override
		public void makeDoor() {
			car.setDoor("no1Door");
		}

		@Override
		public void makeMirror() {
			car.setMirror("no1Mirror");
		}

		@Override
		public Car build() {
			return car;
		}
	}

	public static class No2Builder implements Builder {
		private Car car;

		public No2Builder() {
			car = new Car();
		}
		
		@Override
		public void makeHandle() {
			car.setHandle("no2Handle");
		}

		@Override
		public void makeDoor() {
			car.setDoor("no2Door");
		}

		@Override
		public void makeMirror() {
			car.setMirror("no2Mirror");
		}

		@Override
		public Car build() {
			return car;
		}
	}
	
	public static class Car {
		private String handle;
		private String door;
		private String mirror;
		
		public void setHandle(String handle) {
			this.handle = handle;
		}
		
		public void setDoor(String door) {
			this.door = door;
		}
		
		public void setMirror(String mirror) {
			this.mirror = mirror;
		}
		
		public String content() {
			return "handle:" + handle + ",door:" + door + ",mirror:" + mirror;
		}
	}
}
