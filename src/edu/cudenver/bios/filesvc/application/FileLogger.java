/*
 * File Service for the GLIMMPSE Software System.  Manages
 * upload/save requests.
 * 
 * Copyright (C) 2010 Regents of the University of Colorado.  
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package edu.cudenver.bios.filesvc.application;

import org.apache.log4j.Logger;

/**
 * Singleton log4j wrapper class
 * @author Sarah Kreidler
 *
 */
public class FileLogger
{
    private static Logger instance = null;

    /**
     * Create a new logging object
     */
    private FileLogger() 
    {
    }

    /**
     * Create a single instance of a logging class
     * @return Logger object
     */
    public static Logger getInstance() 
    {
        if (instance == null) 
        {
            instance = Logger.getLogger("edu.cudenver.bios.filesvc.File");
        }

        return instance;
    }
}

