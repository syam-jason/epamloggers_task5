package loggerstack;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;



public class construction {
	private static final Logger LOGGER =LogManager.getLogger(construction.class);

	public double Cost(String Materials,double HouseArea)

	{LOGGER.debug("DEBUG LOGGER");

	LOGGER.info("INFO LOGGER");

	LOGGER.warn("WARN LOGGER");

	LOGGER.error("ERROR LOGGER");

	LOGGER.fatal("FATAL LOGGER");

	

		double Areacost=0;

		if(Materials.equals("StandardMaterials"))

		{

			Areacost=12000*HouseArea;	

		}

		else if(Materials.equals("AboveStandardMaterials"))

		{

			Areacost=15000*HouseArea;

		}

		else if(Materials.equals("HighStandardMaterials"))

		{

			Areacost=18000*HouseArea;

		}

		else if(Materials.equals("HighStandardMaterialsAndFullAutomatedHome"))

		{

			Areacost=25000*HouseArea;

		}

		return Areacost;

	}



}


