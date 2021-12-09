package cs.dit.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("select sysdate form dual")
	public void getTime();
	
	public void getTime2();

}
