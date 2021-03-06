package com.example.rcp.domain;

import java.sql.Timestamp;
import java.time.LocalDate;


import lombok.*;

@Data
@ToString(exclude = {"memberPassword"})
public class Members {
	

	private Integer memberId;
	
	/** 名前 */
	private String memberName;
	
	/** 名前（ひらがな） */
	private String memberNameHiragana;
	
	/** 部署名 */
	private String memberPart;
	
	/** 部署名（ひらがな） */
	private String memberPartHiragana;
	
	/** 内線番号 */
	private String memberTel;
	
	/** emailアドレス*/
	private String memberEmail;
	
	/** パスワード */
	private String memberPassword;
	
	/** 権限 */
	private short memberAuth;
	
	/** 登録日 */
	private Timestamp memberRegDate;
	
	/** 修正日 */
	private Timestamp memberModDate;
	

}
