package com.xworkz.constants;

public enum PartySymbol {
	BJPSYMBOL("LOTUS"),
	JDSSYMBOL("GROSS"),
	CONGRESSYMBOL("PALM"),
	AAPSYMBOL("BROOM"),
	TDPSYMBOL("CYCLE"),
	KJPSSYMBOL("KITE"),
	PRKYSYMBOL("PEN"),
	LDPSYMBOL("UMBRELLA");
	
	private String partySymbol;
	private PartySymbol(String partySymbol) {
		this.partySymbol= partySymbol;
		
	}
	public String getPartySymbol() {
		return partySymbol;
	}
	public static PartySymbol getbyvalue(String value) {
		PartySymbol[] Symbol=PartySymbol.values();
		for(PartySymbol symbol1:Symbol) {
			if(symbol1.partySymbol.equals(value)) {
				return symbol1;
				
			}
		}
		return null;
		
	}
}
