package endsem;

class InvalidPolicyDataException extends Exception {
	public InvalidPolicyDataException(String message) {
		super(message);
	}
}

class InvalidPremiumException extends Exception {
	public InvalidPremiumException(String message) {
		super(message);
	}
}

interface InsuranceOperations {
	double calculatePremium();
	void displayPolicy();
}

abstract class InsurancePolicy implements InsuranceOperations {
	protected String policyNumber, customerName;
	protected double sumInsured, premiumRate;

	public InsurancePolicy(String policyNumber, String customerName, double sumInsured, double premiumRate) throws InvalidPolicyDataException, InvalidPremiumException {
		if (!isValidPolicyNumber(policyNumber)) {
            throw new InvalidPolicyDataException("Exception handled: Policy number should start with 'POL' and be followed by 3 numbers (length 6).");
        }
		if (!isValidCustomerName(customerName)) {
            throw new InvalidPolicyDataException("Exception handled: Customer name should only have one space and should not have any special characters.");
        }
        if (premiumRate <= 0.0) {
            throw new InvalidPremiumException("Exception handled: Premium rate should be greater than 0.");
        }
		this.customerName = customerName;
		this.policyNumber = policyNumber;
		this.sumInsured = sumInsured;
		this.premiumRate = premiumRate;
	}

	public String get_customerName() {
        return customerName;
    }

    public String get_policyNumber() {
        return policyNumber;
    }

    public double get_sumInsured() {
        return sumInsured;
    }

    public double get_premiumRate() {
        return premiumRate;
    }

	private boolean isValidPolicyNumber(String policyNumber) {
        if (policyNumber == null || policyNumber.length() != 6 || !policyNumber.startsWith("POL")) {
            return false;
        }
        try {
            Integer.parseInt(policyNumber.substring(3));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

	private boolean isValidCustomerName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        String trimmedName = name.trim();
        int spaceCount = 0;
        int spaceIndex = -1;

        for (int i = 0; i < trimmedName.length(); i++) {
            char ch = trimmedName.charAt(i);
            if (Character.isLetter(ch)) {
                continue;
            }
			else if (ch == ' ') {
                spaceCount++;
                spaceIndex = i;
            }
			else {
                return false;
            }
        }

        if (spaceCount != 1) {
            return false;
        }

        if (spaceIndex == 0 || spaceIndex == trimmedName.length() - 1) {
            return false;
        }

        String[] parts = trimmedName.split(" ");
        if (parts.length != 2) {
            return false;
        }
		
        return true;
    }

	@Override
    public double calculatePremium() {
        return sumInsured * premiumRate;
    }

	@Override
	public void displayPolicy() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Policy Number: " + policyNumber);
		System.out.println("Sum Insured: " + sumInsured);
		System.out.println("Premium Rate: " + premiumRate);
	}
}

class HealthInsurancePolicy extends InsurancePolicy {
	private int customerAge;

	public HealthInsurancePolicy(String policyNumber, String customerName, double sumInsured, double premiumRate, int customerAge) throws InvalidPolicyDataException, InvalidPremiumException {
		super(policyNumber, customerName, sumInsured, premiumRate);
		this.customerAge = customerAge;
	}

	public int get_customerAge() {
        return customerAge;
    }

	@Override
	public double calculatePremium() {
		double basePremium = super.calculatePremium();
		if (customerAge > 60) {
			return (double) (basePremium * 1.2);
		}
		return basePremium;
	}

	@Override
	public void displayPolicy() {
		super.displayPolicy();
		System.out.println("Customer Age: " + customerAge);
		System.out.println("Calculated Premium: " + calculatePremium());
		System.out.println();
	}
}

class AutoInsurancePolicy extends InsurancePolicy {
	private String vehicleType;

	public AutoInsurancePolicy(String policyNumber, String customerName, double sumInsured, double premiumRate, String vehicleType) throws InvalidPolicyDataException, InvalidPremiumException {
		super(policyNumber, customerName, sumInsured, premiumRate);
		this.vehicleType = vehicleType;
	}

	public String get_vehicleType() {
        return vehicleType;
    }

	@Override
	public double calculatePremium() {
		double basePremium = super.calculatePremium();
		if ("SUV".equalsIgnoreCase(vehicleType)) {
            basePremium *= 1.3;
        }
		else if ("Truck".equalsIgnoreCase(vehicleType)) {
            basePremium *= 1.5;
        }
		return basePremium;
	}

	@Override
	public void displayPolicy() {
		super.displayPolicy();
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Calculated Premium: " + calculatePremium());
		System.out.println();
	}
}

public class InsurancePolicyDemo {
    public static void main(String[] args) {
        InsurancePolicy h1 = null;
        InsurancePolicy a1 = null;
        InsurancePolicy h2 = null;
        InsurancePolicy a2 = null;
        InsurancePolicy h3 = null;
        InsurancePolicy a3 = null;

        try {
            h1 = new HealthInsurancePolicy("POL123", "Ravi Teja", 100000, 0.02, 65);
            h1.displayPolicy();
        } catch (InvalidPolicyDataException | InvalidPremiumException e) {
            System.err.println(e.getMessage());
        }

        try {
            a1 = new AutoInsurancePolicy("POL124", "Arjun Mehta", 200000, 0.015, "Truck");
            a1.displayPolicy();
        } catch (InvalidPolicyDataException | InvalidPremiumException e) {
            System.err.println(e.getMessage());
        }

        try {
            h2 = new HealthInsurancePolicy("123", "Sample Name", 10000, 0.02, 50);
            h2.displayPolicy();
        } catch (InvalidPolicyDataException | InvalidPremiumException e) {
            System.err.println(e.getMessage());
        }

        try {
            a2 = new AutoInsurancePolicy("POL125", "Sample Name", 10000, -0.02, "SUV");
            a2.displayPolicy();
        } catch (InvalidPolicyDataException | InvalidPremiumException e) {
            System.err.println(e.getMessage());
        }

        try {
            h3 = new HealthInsurancePolicy("POL126", "123", 10000, 0.02, 30);
            h3.displayPolicy();
        } catch (InvalidPolicyDataException | InvalidPremiumException e) {
            System.err.println(e.getMessage());
        }

        try {
            a3 = new AutoInsurancePolicy("POL127", "Asha  Rani", 10000, 0.02, "SUV");
            a3.displayPolicy();
        } catch (InvalidPolicyDataException | InvalidPremiumException e) {
            System.err.println(e.getMessage());
        }
    }
}