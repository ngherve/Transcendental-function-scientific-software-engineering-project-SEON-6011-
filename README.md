# Using Scientific Software engineering to implement the transcendental function $y=ab^{x}$.

Software engineering best practices such as agile methodologies and DevOps are increasingly incorporated in the development and implementations of software in organisations. In scientific software engineering, for instance, scientific calculators have to support functionalities including evaluating transcendental functions. In this document we present an implementation of the function $ab^x$. 


## Getting Started

These instructions will get you a copy of the project up and running on your 
local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
*  The model architecture can be switched inside the CNN.py file
*  The Jupiter notebook can be used to test the pre-trained model on a downloaded picture.

### Prerequisites

* Python 3.8.8 (default, Apr 13 2021, 15:08:03) [MSC v.1916 64 bit (AMD64)] :: Anaconda, Inc. on win32
* Pytorch
* StreamLit
* Anaconda packages for jupyter notebook

```
pip install python
```

### Installing

A step by step series of examples that tell you how to get a development env running

* Streamlit
* pytorch
* Jupyter notebook

```
pip install stremlit
pip install torchvision
```

```
pip install pytorch
```
### To test a pre-trained model 
A quick start script to test our pre-trained model can be found in the notebook file

## Running the tests

* clone the repository on your PC


### Break down into end to end tests

To train the model please run the following to generate the trained model. There are 3 models to choose from, you can change the model number in the CNN.py  
* [1] Deep-fewer-maxpooling


```
python cnn.py
```

### To test the model in the app use the following command

```
streamlit run app.py
```

## Deployment

The system application is deployed in Streamlit 

## Built With

* [Streamlit](https://streamlit.io/) - The web framework used
* [Python](https://www.python.org/) - Dependency Management and programming
* [Notebook Jupyter](https://jupyter.org/) - Produce useful results and comparisons

## Versioning

We use Github for versioning. For the versions available, see the [tags on this repository](https://github.com/hormone03/AI_project). 
The report was generate in LaTex

## Authors

* **Herve Ngomseu Fotsing** 

See also the list of [contributors](https://github.com/ngherve/Transcendental-function-scientific-software-engineering-project-SEON-6011-/contributors) who participated in this project.

## License

This project - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Concordia University
* Professor and TAs of the course
