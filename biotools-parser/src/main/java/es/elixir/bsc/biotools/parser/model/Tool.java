/**
 * *****************************************************************************
 * Copyright (C) 2016 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
 * and Barcelona Supercomputing Center (BSC)
 *
 * Modifications to the initial code base are copyright of their respective
 * authors, or their employers as appropriate.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 *****************************************************************************
 */

package es.elixir.bsc.biotools.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Dmitry Repchevsky
 */

@XmlType(name = "", propOrder = {"summary",
                                 "functions",
                                 "labels",
                                 "relations",
                                 "commandLineSpec",
                                 "apiSpec",
                                 "images",
                                 "downloads",
                                 "documentations",
                                 "publications",
                                 "contacts",
                                 "credits"})
@XmlRootElement(name = "tool")
public class Tool {

    private Summary summary;
    private List<Function> functions;
    private Labels labels;
    private List<Relation> relations;
    private CommandLineSpec commandLineSpec;
    private ApiSpec apiSpec;
    private List<Image> images;
    private List<Download> downloads;
    private List<Documentation> documentations;
    private List<Publication> publications;
    private List<Contact> contacts;
    
    protected List<Credit> credits;

    @XmlElement(required = true)
    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @XmlElement(name = "function", required = true)
    public List<Function> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<>();
        }
        return functions;
    }

    @XmlElement(required = true)
    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    @XmlElement(name = "relation")
    public List<Relation> getRelations() {
        if (relations == null) {
            relations = new ArrayList<>();
        }
        return relations;
    }

    public CommandLineSpec getCommandLineSpec() {
        return commandLineSpec;
    }

    public void setCommandLineSpec(CommandLineSpec commandLineSpec) {
        this.commandLineSpec = commandLineSpec;
    }

    public ApiSpec getApiSpec() {
        return apiSpec;
    }

    public void setApiSpec(ApiSpec apiSpec) {
        this.apiSpec = apiSpec;
    }

    @XmlElement(name = "image")
    public List<Image> getImages() {
        if (images == null) {
            images = new ArrayList<>();
        }
        return images;
    }

    @XmlElement(name = "download")
    public List<Download> getDownloads() {
        if (downloads == null) {
            downloads = new ArrayList<>();
        }
        return downloads;
    }

    @XmlElement(name = "documentation")
    public List<Documentation> getDocumentations() {
        if (documentations == null) {
            documentations = new ArrayList<>();
        }
        return documentations;
    }

    @XmlElement(name = "publication")
    public List<Publication> getPublications() {
        if (publications == null) {
            publications = new ArrayList<>();
        }
        return publications;
    }

    @XmlElement(name = "contact", required = true)
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<>();
        }
        return contacts;
    }

    @XmlElement(name = "credit")
    public List<Credit> getCredits() {
        if (credits == null) {
            credits = new ArrayList<>();
        }
        return credits;
    }
}
