/*******************************************************************************
 * Copyright 2014 Likya Teknoloji
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.likya.tlos.model;

import java.util.Calendar;
import java.util.Date;

public class ScenarioRuntimeProperties {
	
	public static final int STATE_RUNNING = 1000;
	public static final int STATE_WAITING = 2000;
	
	private int currentState = STATE_WAITING;
	private Date startTime;
	private Date endTime;
	
	private Date scenarioPeriodT1;
	private Date scenarioPeriodT2;
	private boolean scenarioTimeAnomaly;
	
	public ScenarioRuntimeProperties() {
		super();
		this.startTime = Calendar.getInstance().getTime();
		this.endTime = startTime;
	}
	
	public void resetScenarioTimeAnomalyParams() {
		setScenarioPeriodT1(null);
		setScenarioPeriodT2(null);
		setScenarioTimeAnomaly(false);
	}
	
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getCurrentState() {
		return currentState;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}

	public Date getScenarioPeriodT1() {
		return scenarioPeriodT1;
	}

	public void setScenarioPeriodT1(Date scenarioPeriodT1) {
		this.scenarioPeriodT1 = scenarioPeriodT1;
	}

	public Date getScenarioPeriodT2() {
		return scenarioPeriodT2;
	}

	public void setScenarioPeriodT2(Date scenarioPeriodT2) {
		this.scenarioPeriodT2 = scenarioPeriodT2;
	}

	public boolean isScenarioTimeAnomaly() {
		return scenarioTimeAnomaly;
	}

	public void setScenarioTimeAnomaly(boolean scenarioTimeAnomaly) {
		this.scenarioTimeAnomaly = scenarioTimeAnomaly;
	}
	
}
