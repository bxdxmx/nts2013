package jp.co.nts.logic;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	static public class Car {
		private int speed1;
		private int speed2;
		private int speed3;
		private int speed4;
		
		public void setSpeed1ByRPC(int speed) {
			// network�A�N�Z�X�̃I�[�o�[�w�b�h
			this.speed1 = speed;
		}
		public void setSpeed2ByRPC(int speed) {
			// network�A�N�Z�X�̃I�[�o�[�w�b�h
			this.speed2 = speed;
		}
		public void setSpeed3ByRPC(int speed) {
			// network�A�N�Z�X�̃I�[�o�[�w�b�h
			this.speed3 = speed;
		}
		public void setSpeed4ByRPC(int speed) {
			// network�A�N�Z�X�̃I�[�o�[�w�b�h
			this.speed4 = speed;
		}
		
		public void facadeByRPC(int speed1, int speed2, int speed3, int speed4) {
			// network�A�N�Z�X�̃I�[�o�[�w�b�h
			this.speed1 = speed1;
			this.speed2 = speed2;
			this.speed3 = speed3;
			this.speed4 = speed4;
		}
	}
}
