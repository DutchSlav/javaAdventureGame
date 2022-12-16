package io.vaclst.adventure.money;


import io.vaclst.adventure.IJob;
import io.vaclst.adventure.money.jobs.Allowance;
import io.vaclst.adventure.money.jobs.HamburgerCook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Job {
    private final ArrayList<IJob> IJobs = new ArrayList<>();
    private final Map<String, IJob> stringToJob = new HashMap<>();
    private IJob job;

    public Job() {

        IJob allowance = new Allowance();
        IJob hamburgerCook = new HamburgerCook();

        this.stringToJob.put("allowance", allowance);
        this.stringToJob.put("hamburgercook", hamburgerCook);

        this.IJobs.add(allowance);
        this.IJobs.add(hamburgerCook);

        job = this.IJobs.get(this.IJobs.indexOf(allowance));
    }

    public void setJob(IJob job) { this.job = this.IJobs.get(this.IJobs.indexOf(job)); }
    public IJob getJob() { return this.job; }
    public ArrayList<IJob> getJobs() { return this.IJobs; }
    public IJob getJobByName(String name) {
        if (this.stringToJob.containsKey(name)) {
            return this.stringToJob.get(name);
        } else {
            return null;
        }
    }
}
