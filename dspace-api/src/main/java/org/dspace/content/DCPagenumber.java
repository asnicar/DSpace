/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.content;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

import org.apache.log4j.Logger;

//Classe di supporto per il tipo DC Pagenumber 
public class DCPagenumber
{
    /** Logger */
    private static Logger log = Logger.getLogger(DCPagenumber.class);

   private Integer startPage;
   private Integer endPage;

    
   
    public DCPagenumber(Integer startPage, Integer endPage)
    {
        this.startPage = startPage;
        this.endPage = endPage;
    }


    
    public String toString()
    {
        
        return this.startPage + "-" + this.endPage;
    }


	public Integer getStartPage() {
		return startPage;
	}


	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}


	public Integer getEndPage() {
		return endPage;
	}


	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}

    
    

    
}
