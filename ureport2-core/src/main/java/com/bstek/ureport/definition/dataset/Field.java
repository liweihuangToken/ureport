/*******************************************************************************
 * Copyright 2017 Bstek
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.bstek.ureport.definition.dataset;

/**
 * @author Jacky.gao
 * @since 2016年12月30日
 */
public class Field {
	private String name;//字段名
	private String nameAndRemark;//字段名和注释

//	public Field(String name) {
//		this.name=name;
//	}

	public Field(String name, String nameAndRemark) {
		this.name = name;
		this.nameAndRemark = nameAndRemark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameAndRemark() {
		return nameAndRemark;
	}

	public void setNameAndRemark(String nameAndRemark) {
		this.nameAndRemark = nameAndRemark;
	}
}
