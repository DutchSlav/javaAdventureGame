package io.vaclst.adventure.money.jobs;

import io.vaclst.adventure.IJob;

public class Allowance implements IJob {
    @Override
    public double pay() { return 5; }
}
