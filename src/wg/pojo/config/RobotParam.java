package wg.pojo.config;

public class RobotParam {

	/**
	 * ��Χ�����Ҹ���
	 */
	public Integer maxAroundPlayerNum = 20;
	
	/**
	 * �һ�����ID<br/>
	 * 0x19/25:��Ѫħ��<br/>
	 * 0x1A/26:��ڤ��<br/>
	 * 0x1D/29:а�����<br/>
	 * 0x1B/27:�������<br/>
	 * 0x1C/28:���ҵ���<br/>
	 * 0x20:ڤ��
	 */
	public Integer mapId = 26;
	
	/**
	 * ʰȡװ���ȼ�
	 */
	public Integer filterLevel = 60;

	@Override
	public String toString() {
		return "RobotParam{" +
				"maxAroundPlayerNum=" + maxAroundPlayerNum +
				", mapId=" + mapId +
				", filterLevel=" + filterLevel +
				'}';
	}
}
