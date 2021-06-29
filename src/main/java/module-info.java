/*
 * nmw-oss-website - The oss.newmediaworks.com website.
 * Copyright (C) 2021  New Media Works
 *     info@newmediaworks.com
 *     703 2nd Street #465
 *     Santa Rosa, CA 95404
 *
 * This file is part of nmw-oss-website.
 *
 * nmw-oss-website is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * nmw-oss-website is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with nmw-oss-website.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.newmediaworks.oss.website {
	// Direct
	requires com.newmediaworks.taglib.email.book; // <groupId>com.newmediaworks</groupId><artifactId>nmw-email-taglib-book</artifactId>
	requires com.newmediaworks.javadoc.resources.book; // <groupId>com.newmediaworks</groupId><artifactId>nmw-javadoc-resources-book</artifactId>
	requires com.newmediaworks.oss.book; // <groupId>com.newmediaworks</groupId><artifactId>nmw-oss-book</artifactId>
	requires com.newmediaworks.oss.parent.book; // <groupId>com.newmediaworks</groupId><artifactId>nmw-oss-parent-book</artifactId>
	requires com.newmediaworks.taglib.payment.book; // <groupId>com.newmediaworks</groupId><artifactId>nmw-payment-taglib-book</artifactId>
	requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
	requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
	requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
}
