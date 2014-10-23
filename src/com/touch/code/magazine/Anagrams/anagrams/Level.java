/*
 * Copyright (c) 2014 MyAppConverter
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MyAppConverter License v1.0
 * which accompanies this distribution, and is available at
 * http://www.myappconverter.com/legal/epl-v1.html
 *
 * Contributors:
 *    MyAppConverter Core Team - initial API and implementation
 * @date : Sep, 29 2014 - 13:31:57
 */

package com.touch.code.magazine.Anagrams.anagrams;

import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSObject;

public abstract class Level extends NSObject {
	/**
	 * The cached value of the '<em>pointsPerTile</em>' property.
	 * 
	 * @see #getPointsPerTile()
	 * @generated
	 * @ordered
	 */
	public int pointsPerTile;

	/**
	 * Returns the value of the '<em><b>pointsPerTile</b></em>' property.
	 * 
	 * @return int.
	 * @see #setPointsPerTile(int)
	 * @generated
	 */
	public int getPointsPerTile() {
		return this.pointsPerTile;
	}

	/**
	 * Sets the value of the '{@link <em>pointsPerTile</em>}' property.
	 * 
	 * @param int the new value of the '<em>pointsPerTile</em>' property.
	 * @see #getPointsPerTile()
	 * @generated
	 */
	public void setPointsPerTile(int pointsPerTile) {
		this.pointsPerTile = pointsPerTile;
	}

	/**
	 * The cached value of the '<em>timeToSolve</em>' property.
	 * 
	 * @see #getTimeToSolve()
	 * @generated
	 * @ordered
	 */
	public int timeToSolve;

	/**
	 * Returns the value of the '<em><b>timeToSolve</b></em>' property.
	 * 
	 * @return int.
	 * @see #setTimeToSolve(int)
	 * @generated
	 */
	public int getTimeToSolve() {
		return this.timeToSolve;
	}

	/**
	 * Sets the value of the '{@link <em>timeToSolve</em>}' property.
	 * 
	 * @param int the new value of the '<em>timeToSolve</em>' property.
	 * @see #getTimeToSolve()
	 * @generated
	 */
	public void setTimeToSolve(int timeToSolve) {
		this.timeToSolve = timeToSolve;
	}

	/**
	 * The cached value of the '<em>anagrams</em>' property.
	 * 
	 * @see #getAnagrams()
	 * @generated
	 * @ordered
	 */
	public NSArray anagrams;

	/**
	 * Returns the value of the '<em><b>anagrams</b></em>' property.
	 * 
	 * @return NSArray.
	 * @see #setAnagrams(NSArray)
	 * @generated
	 */
	public NSArray getAnagrams() {
		return this.anagrams;
	}

	/**
	 * Sets the value of the '{@link <em>anagrams</em>}' property.
	 * 
	 * @param NSArray
	 *            the new value of the '<em>anagrams</em>' property.
	 * @see #getAnagrams()
	 * @generated
	 */
	public void setAnagrams(NSArray anagrams) {
		this.anagrams = anagrams;
	}

}
