package wg.event;

public interface IEventType {

	/**
	 * ��ɫ�ѵ�¼
	 * �¼��������ͣ�Player
	 */
	String PLAYER_LOGINED = "PLAYER_LOGINED";
	
	/**
	 * ���������Ѽ���
	 * �¼��������ͣ�PackageInfo
	 */
	String PACKAGE_LOADED = "PACKAGE_LOADED";

	/**
	 * �ֿ������Ѽ��أ��ֿ�������120��������λ�ô�0��ʼ
	 * �¼��������ͣ�M1732
	 */
	String STORE_LOADED = "STORE_LOADED";
	
	String PLAYER_INFO_INITED = "PLAYER_INFO_INITED";
	
	/**
	 * ��ͼ�������л�
	 * �¼��������ͣ�Long��������ţ�
	 */
	String SCENE_CHANGED = "SCENE_CHANGED";
	
	/**
	 * �����µ����/���ǽ
	 * �¼��������ͣ�M1501
	 */
	String NEW_PLAYER_APPEARED = "NEW_PLAYER_APPEARED";

	/**
	 * ���/���ǽ��ʧ
	 * �¼��������ͣ�M1501
	 */
	String PLAYER_DISAPPEARED = "PLAYER_DISAPPEARED";
	
	/**
	 * �һ���ȡ��
	 */
	String ROBOT_MODE_CANCELED = "ROBOT_MODE_CANCELED";
	
}
