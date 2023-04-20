package member.board.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MemDto {
	
	@NotNull(message="writer is null")
	@NotEmpty(message="writer is Empty")
	private String id;
	@NotNull(message="writer is null")
	@NotEmpty(message="writer is Empty")
	private String password;
	private String name;
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date birth;
	private String address;
}
