package com.xworkz.DTO;

import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PoliticianDTO {
	private int id;
	private PartyName partyName=PartyName.AAP;
	private String president;
	private double TotalMembers;
	private PartySymbol partySymbol=PartySymbol.BJPSYMBOL;
	private String partylocation;
	private String partycolour;
	private String partystate;
	private double partybudget;

}
