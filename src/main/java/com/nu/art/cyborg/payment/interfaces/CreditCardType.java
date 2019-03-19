/*
 * Copyright (c) 2017 to Adam van der Kruk (Zehavi) AKA TacB0sS - Nu-Art Software
 *
 * This software code is not an 'Open Source'!
 * In order to use this code you MUST have a proper license.
 * In order to obtain a licence please contact me directly.
 *
 * Email: Adam.Zehavi@Nu-Art-Software.com
 */

package com.nu.art.cyborg.payment.interfaces;

/**
 * Created by TacB0sS on 28-Aug 2016.
 */
public interface CreditCardType {

	String getRegex();

	int getCvvLength();

	int getCardLogoId();
}
