package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Builder�p�^�[��
 *  �����I�u�W�F�N�g�ɂ��āA���̍쐬�ߒ���\���`���Ɉˑ����Ȃ����̂ɂ��邱�Ƃɂ��A
 *  �����쐬�ߒ��ňقȂ�\���`���̃I�u�W�F�N�g�𐶐��ł���悤�ɂ���B
 * 
 */

public class Before {
	public static void main(String[] args) {
		int a = 1;
		Car car = new Car();

		if( a == 1) {
			car.setHandle("my handle");
			car.setDoor("your door");
			car.setMirror("a mirror");
		} else if( a == 2 ) {
			car.setHandle("only handle?");
		}
		
		System.out.println(car.content());
		
		/*
		 * �I�u�W�F�N�g�Ăяo�����ŁA���ꂼ��̃p�����[�^���ǂ��Z�b�g���Ȃ���΂Ȃ�Ȃ����ӎ�����K�v������B
		 * ���r���[�ȏ�ԂŃI�u�W�F�N�g���g�����Ƃ��ł��Ă��܂��B
		 * a==3�̎������K�v�ɂȂ������ɁAif�̕���𑝂₳�Ȃ��Ƃ����Ȃ��B
		 */
	}
}
