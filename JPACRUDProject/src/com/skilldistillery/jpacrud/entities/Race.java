package com.skilldistillery.jpacrud.entities;

public enum Race {

	DWARF("Dwarf"), ELF("Elf"), HALFLING("Halfling"), HALFELF("Half-Elf"), HALFORC("Half-Orc"), HUMAN("Human");
	private final String fieldDescription;
	private final String jspDescription;
	
	
    private Race(String value) {
        fieldDescription = value;
         jspDescription = value.toUpperCase();
    }
    
    public String getFieldDescription() {
        return fieldDescription;
    }
    
    public String getjspDescription() {
    	return jspDescription;
    }
}
