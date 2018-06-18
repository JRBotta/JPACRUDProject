package com.skilldistillery.jpacrud.entities;

public enum Race {

	DWARF("Dwarf"), ELF("Elf"), HALFLING("Halfling"), HALFELF("Half-Elf"), HALFORC("Half-Orc"), HUMAN("Human");
	private final String fieldDescription;
	
	
    private Race(String value) {
        fieldDescription = value;
    }
    
    public String getFieldDescription() {
        return fieldDescription;
    }
    
}
