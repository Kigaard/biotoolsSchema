# What is biotoolsSchema?

**biotoolsSchema** is a formalised XML schema (XSD) which defines a description model for bioinformatics software.  It can be used to describe bioinformatics tools - application software with well-defined data processing functions (inputs, outputs and operations).   This includes simple tools with one or a few closely related functions, and complex, multimodal tools with many functions.  A broad range of software types (see below) are covered including tools available for immediate use as online services, or in a form which which you can download, install, configure and run yourself.

biotoolsSchema defines over 50 important scientific, technical and administrative attributes that support cataloguing, discovery, use and interoperability of software.  It concentrates upon the salient common features, with a minimal core of 3 attributes only (name, short description and homepage), to provide maximum flexibility for applications.  To enable concise information, standard identifiers are used where possible, including [EDAM ontology](http://github.com/edamontology/edamontology) concept IDs for specialised scientific aspects.  biotoolsSchema defines 18 controlled vocabularies for technical tool aspects.  Verbose information is referred to by URL.

biotoolsSchema is applicable to a broad range of [software types](http://biotoolsschema.readthedocs.io/en/latest/controlled_vocabularies.html#tool-type) and is used by the ELIXIR Tools & Data Services Registry [bio.tools](https://bio.tools) ).


# Documentation (for stable version 3.2.0):
Comprehensive documentation is available: 
* [Technical docs](http://bio-tools.github.io/biotoolsSchema/) (built from files under [/stable/docs/](https://github.com/bio-tools/biotoolsSchema/tree/master/stable/docs) )
* [General docs](http://biotoolsschema.readthedocs.io/en/latest/) (built from files maintained [here](https://github.com/bio-tools/biotoolsschemadocs/) )

# Information standard
biotoolsSchema together with the [EDAM ontology](https://github.com/edamontology/edamontology) provide the foundation for an [information standard](https://github.com/bio-tools/Tool-Information-Standards) for the desription of tools.  


# Files

File                            | Description
----                            | -----------
biotools_dev.xsd                | biotoolsSchema - dev version (XML schema)
stable                          | Current stable version of the schema + docs 
docs                            | Technical docs formatted for website (latest stable version).  Hosted [here](http://bio-tools.github.io/biotoolsSchema/) (uses files copied from "stable" folder)
versions                        | Older stable versions of the schema + docs
LICENSE                         | biotoolsSchema license information
README.md		        | This file

