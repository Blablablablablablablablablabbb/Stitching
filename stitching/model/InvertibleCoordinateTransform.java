/**
 * License: GPL
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License 2
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * An execption is the FFT implementation of Dave Hale which we use as a library,
 * wich is released under the terms of the Common Public License - v1.0, which is 
 * available at http://www.eclipse.org/legal/cpl-v10.html  
 * 
 * @author Stephan Saalfeld <saalfeld@mpi-cbg.de>
 *
 */
package stitching.model;

public interface InvertibleCoordinateTransform extends CoordinateTransform
{
	/**
	 * Apply the inverse of the model to a point location
	 * 
	 * @param point
	 * @return transformed point
	 */
	abstract public float[] applyInverse( float[] point ) throws NoninvertibleModelException;

	
	/**
	 * apply the inverse of the model to a point location
	 * 
	 * @param point
	 */
	abstract public void applyInverseInPlace( float[] point ) throws NoninvertibleModelException;
	
}
