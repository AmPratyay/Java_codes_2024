package Z_ROUGH_CODE.java_08;

public class Worker {

    public String workerName;

    public int workerId;

    public Worker(String workerName, int workerId) {
        this.workerName = workerName;
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String toString() {
        return workerId + " : " + workerName;
    }
}
