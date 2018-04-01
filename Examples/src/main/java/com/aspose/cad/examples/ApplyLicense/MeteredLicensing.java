package com.aspose.cad.examples.ApplyLicense;

import java.math.BigDecimal;

public class MeteredLicensing 
{

	public static void main(String[] args) 
        {
		//ExStart:MeteredLicensing

        // Access the setMeteredKey property and pass public and private keys as parameters
        com.aspose.cad.Metered.setMeteredKey("<valid pablic key>", "<valid private key>");
        
        // Get consumed qantity value before accessing API
            BigDecimal quantityOld = com.aspose.cad.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantityOld);

        // DO PROCESSING
        //com.aspose.cad.fileformats.cad.CadImage image = 
        //        (com.aspose.cad.fileformats.cad.CadImage)com.aspose.cad.Image.load("BlockRefDgn.dwg");
        
        
        // Get consumed qantity value after accessing API
            BigDecimal quantity = com.aspose.cad.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantity());
		
//ExEnd:MeteredLicensing
	}

    private static String quantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
