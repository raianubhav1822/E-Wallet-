package com.anubhav.walletservice.Util;

import com.anubhav.walletservice.Model.Wallet;

public class WalletValidator {
    public boolean validateWalletRequest(Wallet wallet){
        /*
        Write your logic to implement validation
         */
        if(wallet.getUser_id()==null || wallet.getUser_id()=="" )
            return false;
        return true;
    }
}
