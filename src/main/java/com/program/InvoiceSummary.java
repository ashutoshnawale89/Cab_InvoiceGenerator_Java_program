package com.program;

import java.util.Objects;

public class InvoiceSummary {

	public final  double averageFarePerRide;
	public final int numberOfRides;
	public final double totalFare;

	public InvoiceSummary(int length, double totalFare) {
		this.numberOfRides = length;
		this.totalFare = totalFare;
		this.averageFarePerRide = this.totalFare /this.numberOfRides;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		InvoiceSummary summary = (InvoiceSummary) o;
		return numberOfRides == summary.numberOfRides && Double.compare(summary.totalFare, totalFare) == 0 &&
				Double.compare(summary.averageFarePerRide, averageFarePerRide) == 0;

	}
	@Override
	public int hashCode() {
		return Objects.hash(numberOfRides, totalFare, averageFarePerRide);
	}
}
