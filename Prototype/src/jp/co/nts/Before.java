package jp.co.nts;

import static jp.co.nts.logic.Sample.*;

/*
 * Prototype�p�^�[��
 *  �������ׂ��I�u�W�F�N�g�̎�ނ����^�ƂȂ�C���X�^���X���g���Ė��m�ɂ��A
 *  ������R�s�[���邱�ƂŐV���ȃI�u�W�F�N�g�̐������s��
 *  
 *  
 *  �I�u�W�F�N�g��clone���쐬����A�Ƃ��������B
 */

public class Before {
	public static void main(String[] args) {
		for( int i=0;i<10;i++) {
			System.out.println(i);
			Car car1 = new Car1();
			Car car2 = new Car2();
		}
		
		/*
		 * �O�����Ɏ��Ԃ̂�����I�u�W�F�N�g���������������̂͑��
		 * �O�����Ƀ�������ΏۂɎg�p����I�u�W�F�N�g������������������̂͑��
		 */
	}
}
