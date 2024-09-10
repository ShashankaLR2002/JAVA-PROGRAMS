package com.shsh.EqualsandToStringOverride;
import java.util.Objects;
public class CreditCard {
	 private String cardNumber;
	    private String cardHolderName;
	    private String expiryDate;
	    private double creditLimit;
	    private String bankName;
	    private boolean isActive;

	  
	    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, double creditLimit, String bankName, boolean isActive) {
	        this.cardNumber = cardNumber;
	        this.cardHolderName = cardHolderName;
	        this.expiryDate = expiryDate;
	        this.creditLimit = creditLimit;
	        this.bankName = bankName;
	        this.isActive = isActive;
	    }

	  
	    @Override
	    public String toString() {
	        return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName +
	               ", expiryDate=" + expiryDate + ", creditLimit=" + creditLimit +
	               ", bankName=" + bankName + ", isActive=" + isActive + "]";
	    }

	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        CreditCard creditCard = (CreditCard) obj;
	        return Objects.equals(cardNumber, creditCard.cardNumber) &&
	               Objects.equals(cardHolderName, creditCard.cardHolderName) &&
	               Objects.equals(expiryDate, creditCard.expiryDate);
	    }

}
