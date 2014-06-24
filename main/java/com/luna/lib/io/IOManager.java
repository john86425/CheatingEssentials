/*
 * Isis modified client for Minecraft.
 * Copyright (C) 2014-2015  godshawk
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * ===========================================================================
 *
 * ALL SOURCE CODE WITHOUT THIS COPYRIGHT IS THE PROPERTY OF ITS RESPECTIVE
 * OWNER(S). I CLAIM NO RIGHT TO OR OWNERSHIP OF ANY OF IT.
 *
 * Minecraft is owned by Mojang AB.
 * Java itself is owned by Oracle.
 * All other code is not owned by me.
 * Thank you, and have a good day!
 */

package com.luna.lib.io;

import java.util.List;

/**
 * Yes, I did look at other people's code to help.
 *
 * @author godshawk
 */
public interface IOManager {

    /**
     * Sets up the input stream
     */
    void setupRead();

    /**
     * Sets up the output stream
     */
    void setupWrite();

    /**
     * Closes all streams
     */
    void closeStream();

    /**
     * Reads all lines from the file, returns them as a list
     *
     * @return
     */
    List<String> read();

    /**
     * Writes the list into the file
     *
     * @param data
     */
    void write(List<String> data);
}
