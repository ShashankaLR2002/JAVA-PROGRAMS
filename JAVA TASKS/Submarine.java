class Submarine {
    private String name;
    private int length;
    private int displacement;
    private int crewSize;
    private String countryOfOrigin;

    private int maxDepth;
    private int speed;
    private String propulsionType;
    private String sonarSystem;
    private String radarSystem;
    private boolean isNuclearPowered;
    private String missileType;
    private int torpedoCount;
    private String communicationSystem;
    private String hullMaterial;
    private String classification;
    private String stealthCapabilities;
    private String submersionDuration;
    private String commissioningDate;
    private String decommissioningDate;
    private int armamentLoad;
    private String operationalRange;
    private int periscopeCount;
    private String periscopeType;
    private String emergencySystem;
    private String escapeHatchType;
    private int crewCompartmentCount;
    private String commandSystem;
    private String navigationSystem;
    private String onboardComputer;
    private int batteryLife;
    private String powerOutput;
    private String defenseSystem;
    private String attackSystem;
    private int sonarRange;
    private int radarRange;

    public Submarine(String name, int length, int displacement, int crewSize, String countryOfOrigin) {
        this.name = name;
        this.length = length;
        this.displacement = displacement;
        this.crewSize = crewSize;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public void setSonarSystem(String sonarSystem) {
        this.sonarSystem = sonarSystem;
    }

    public void setRadarSystem(String radarSystem) {
        this.radarSystem = radarSystem;
    }

    public void setIsNuclearPowered(boolean isNuclearPowered) {
        this.isNuclearPowered = isNuclearPowered;
    }

    public void setMissileType(String missileType) {
        this.missileType = missileType;
    }

    public void setTorpedoCount(int torpedoCount) {
        this.torpedoCount = torpedoCount;
    }

    public void setCommunicationSystem(String communicationSystem) {
        this.communicationSystem = communicationSystem;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setStealthCapabilities(String stealthCapabilities) {
        this.stealthCapabilities = stealthCapabilities;
    }

    public void setSubmersionDuration(String submersionDuration) {
        this.submersionDuration = submersionDuration;
    }

    public void setCommissioningDate(String commissioningDate) {
        this.commissioningDate = commissioningDate;
    }

    public void setDecommissioningDate(String decommissioningDate) {
        this.decommissioningDate = decommissioningDate;
    }

    public void setArmamentLoad(int armamentLoad) {
        this.armamentLoad = armamentLoad;
    }

    public void setOperationalRange(String operationalRange) {
        this.operationalRange = operationalRange;
    }

    public void setPeriscopeCount(int periscopeCount) {
        this.periscopeCount = periscopeCount;
    }

    public void setPeriscopeType(String periscopeType) {
        this.periscopeType = periscopeType;
    }

    public void setEmergencySystem(String emergencySystem) {
        this.emergencySystem = emergencySystem;
    }

    public void setEscapeHatchType(String escapeHatchType) {
        this.escapeHatchType = escapeHatchType;
    }

    public void setCrewCompartmentCount(int crewCompartmentCount) {
        this.crewCompartmentCount = crewCompartmentCount;
    }

    public void setCommandSystem(String commandSystem) {
        this.commandSystem = commandSystem;
    }

    public void setNavigationSystem(String navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public void setOnboardComputer(String onboardComputer) {
        this.onboardComputer = onboardComputer;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setPowerOutput(String powerOutput) {
        this.powerOutput = powerOutput;
    }

    public void setDefenseSystem(String defenseSystem) {
        this.defenseSystem = defenseSystem;
    }

    public void setAttackSystem(String attackSystem) {
        this.attackSystem = attackSystem;
    }

    public void setSonarRange(int sonarRange) {
        this.sonarRange = sonarRange;
    }

    public void setRadarRange(int radarRange) {
        this.radarRange = radarRange;
    }

    public void print() {
        System.out.println("Submarine Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Displacement: " + displacement);
        System.out.println("Crew Size: " + crewSize);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Max Depth: " + maxDepth);
        System.out.println("Speed: " + speed);
        System.out.println("Propulsion Type: " + propulsionType);
        System.out.println("Sonar System: " + sonarSystem);
        System.out.println("Radar System: " + radarSystem);
        System.out.println("Is Nuclear Powered: " + isNuclearPowered);
        System.out.println("Missile Type: " + missileType);
        System.out.println("Torpedo Count: " + torpedoCount);
        System.out.println("Communication System: " + communicationSystem);
        System.out.println("Hull Material: " + hullMaterial);
        System.out.println("Classification: " + classification);
        System.out.println("Stealth Capabilities: " + stealthCapabilities);
        System.out.println("Submersion Duration: " + submersionDuration);
        System.out.println("Commissioning Date: " + commissioningDate);
        System.out.println("Decommissioning Date: " + decommissioningDate);
        System.out.println("Armament Load: " + armamentLoad);
        System.out.println("Operational Range: " + operationalRange);
        System.out.println("Periscope Count: " + periscopeCount);
        System.out.println("Periscope Type: " + periscopeType);
        System.out.println("Emergency System: " + emergencySystem);
        System.out.println("Escape Hatch Type: " + escapeHatchType);
        System.out.println("Crew Compartment Count: " + crewCompartmentCount);
        System.out.println("Command System: " + commandSystem);
        System.out.println("Navigation System: " + navigationSystem);
        System.out.println("Onboard Computer: " + onboardComputer);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Power Output: " + powerOutput);
        System.out.println("Defense System: " + defenseSystem);
        System.out.println("Attack System: " + attackSystem);
        System.out.println("Sonar Range: " + sonarRange);
        System.out.println("Radar Range: " + radarRange);
    }
}
