// Create the clean sweep class
class CleanSweep {
    private sweepData: SweepingData;
 
    constructor() {
        this.sweepData = new SweepingData();
    }
 
    public start(): void {
        console.log("Cleaning sweep in action!");
        this.sweepData.preSweep();
        this.sweepData.sweep();
    }
 
    public stop(): void {
        this.sweepData.stopSweep();
        console.log("Cleaning sweep stopped!");
    }
}

// Create the sweeping data class
class SweepingData {
    private isAllCleaned: boolean;
    private isSweeping: boolean;
 
    constructor() {
        this.isAllCleaned = false;
        this.isSweeping = false;
    }
 
    public preSweep(): void {
        console.log("Preparing to sweep...");
        this.isAllCleaned = false;
    }
 
    public sweep(): void {
        console.log("Sweeping...");
        this.isSweeping = true;
    }
 
    public stopSweep(): void {
        console.log("Cleaning up...");
        this.isAllCleaned = true;
        this.isSweeping = false;
    }
}

// Create the cleaning robot object and initiate clean sweep
let cleanRobot: CleanSweep = new CleanSweep();
cleanRobot.start();
cleanRobot.stop();