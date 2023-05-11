import React, { useState } from "react";
import Tab from "react-bootstrap/Tab";
import Tabs from "react-bootstrap/Tabs";
import "./App.css";
import Button from "react-bootstrap/Button";
import Table from "react-bootstrap/Table";
import Form from "react-bootstrap/Form";
import Card from "react-bootstrap/Card";
import { CarServiceClient } from "./output/CarServiceClientPb";
import { CarInformation, CarSaveRequest, CarSaveResponse, SearchRequest, SearchResponse,LowestTotalAnnualCostRequest,LowestTotalAnnualCostResponse ,LowestTotalAnnualCostInformation} from "./output/car_pb";

function App() {
  const [make, setMake] = useState("");
  const [model, setModel] = useState("");
  const [yearofrelease, setYearofrelease] = useState("");
  const [version, setVersion] = useState("");
  const [price, setPrice] = useState("");
  const [fuelconsumption, setFuelconsumption] = useState("");
  const [annualmaintenancecost, setAnnualmaintenancecost] = useState("");
  const [searchResult1, setSerachResult1] = useState<CarInformation[]>([]);
  const [searchResult2, setSerachResult2] = useState<LowestTotalAnnualCostInformation[]>([]);
  const [priceoffuel, setPriceoffuel] = useState("");
  const [expecteddistance, setExpecteddistance] = useState("");
  
  
  const searchCar = () => {

    // create our searchRequest object
    const searchRequest = new SearchRequest();
    searchRequest.setMake(make);
    searchRequest.setYearofrelease(Number(yearofrelease));

    // create gRPC client that will call ou java server
    const client = new CarServiceClient("http://localhost:8080").searchCar(
      searchRequest,
      {},
      (err, response: SearchResponse) => {
        console.log({ err, response });
        if (response?.getCarinformationlistList()) setSerachResult1(response?.getCarinformationlistList());
      }
    );
  };

  const searchLowestTotalAnnualCost = () => {

    // create our searchRequest object
    const lowestTotalAnnualCostRequest = new LowestTotalAnnualCostRequest();
    lowestTotalAnnualCostRequest.setPriceoffuel(Number(priceoffuel));
    lowestTotalAnnualCostRequest.setExpecteddistance(Number(expecteddistance));

    // create gRPC client that will call ou java server
    const client = new CarServiceClient("http://localhost:8080").searchLowestTotalAnnualCost(
      lowestTotalAnnualCostRequest,
      {},
      (err, response: LowestTotalAnnualCostResponse) => {
        console.log({ err, response });
        if (response?.getLowesttotalannualcostlistList()) setSerachResult2(response?.getLowesttotalannualcostlistList());
      }
    );
  };

  const saveCarCall = () => {
    // create our carSaveRequest object
    const carSaveRequest = new CarSaveRequest();
    const carInformation = new CarInformation();

    carInformation.setMake(make);
    carInformation.setModel(model);
    carInformation.setAnnualmaintenancecost(Number(annualmaintenancecost));    
    carInformation.setPrice(Number(price));
    carInformation.setYearofrelease(Number(yearofrelease));
    carInformation.setVersion(version);
    carInformation.setFuelconsumption(Number(fuelconsumption));
  
    carSaveRequest.setCarinformation(carInformation);
    console.log({ carInformation, carSaveRequest });
    setSerachResult1([...searchResult1, carInformation]); 
    
    // create gRPC client that will call ou java server
    const client = new CarServiceClient("http://localhost:8080").saveCar(
      carSaveRequest,
      {},
      (err, response: CarSaveResponse) => {
        console.log({ err, response });
      }
    );
  };

  return (
    <Tabs defaultActiveKey="addnewcar" transition={false} id="noanim-tab-example" className="mb-3">
      
      <Tab eventKey="addnewcar" title="Add A New Car">
        <Card style={{ margin: 20 }}>
          <Card.Header>Add A New Car</Card.Header>
          <Card.Body>
            <Form.Group className="mb-3" controlId="formBasicEmail">
              <Form.Label>Make</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setMake(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Make"/>
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Model</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setModel(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Model"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Year Of Release</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setYearofrelease(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Year Of Release"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Price (€)</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setPrice(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Price"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Fuel Consumption (km/l)</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setFuelconsumption(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter "
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Annual Maintenance Cost (€)</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setAnnualmaintenancecost(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Annual Maintenance Cost"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Version</Form.Label>
              <Form.Control
                onChange={(e) => {
                  setVersion(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Version"
              />
            </Form.Group>
            <div className="btnc">
              <Button variant="primary" style={{ width: 200 }} onClick={saveCarCall}>
                Save
              </Button>
            </div>
          </Card.Body>
        </Card>
      </Tab>

      <Tab eventKey="searchcar" title="Search The Car">
      <Card style={{ margin: 20 }}>
          <Card.Header>Search The Car</Card.Header>
          <Card.Body>
            <div className="section2">
              <Form.Control
                onChange={(e) => {
                  setMake(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Make"
              />
              <Form.Control
                onChange={(e) => {
                  setYearofrelease(e.currentTarget.value);
                }}
                style={{ marginLeft: 10, marginRight: 10 }}
                type="text"
                placeholder="Enter Year Of Release"
              />
              <Button variant="primary" onClick={searchCar}>
                Search
              </Button>
            </div>
            <Table striped bordered hover size="sm">
              <thead>
                <tr>                  
                  <th>Make</th>
                  <th>Model</th>
                  <th>Year Of Release</th>
                  <th>Price (€)</th>
                  <th>Fuel Consumption (km/l)</th>
                  <th>Annual Maintenance Cost (€)</th>
                  <th>Version</th>
                </tr>
              </thead>
              <tbody>
                {searchResult1.map((e: CarInformation,i:Number) => {
                  return (
                    <tr>                      
                      <td>{e.getMake()}</td>
                      <td>{e.getModel()}</td>
                      <td>{e.getYearofrelease()}</td>
                      <td>{e.getPrice()}</td>
                      <td>{e.getFuelconsumption()}</td>
                      <td>{e.getAnnualmaintenancecost()}</td>
                      <td>{e.getVersion()}</td>
                    </tr>
                  );
                })}
              </tbody>
            </Table>
          </Card.Body>
        </Card>
      </Tab>

      <Tab eventKey="totalcost" title="Calculate 4 Years Total Cost">
      <Card style={{ margin: 20 }}>
          <Card.Header>Calculate 4 Years Total Cost</Card.Header>
          <Card.Body>
            <div className="section2">
              <Form.Control
                onChange={(e) => {
                  setExpecteddistance(e.currentTarget.value);
                }}
                type="text"
                placeholder="Enter Expected Distance To Travel Each Month"
              />
              <Form.Control
                onChange={(e) => {
                  setPriceoffuel(e.currentTarget.value);
                }}
                style={{ marginLeft: 10, marginRight: 10 }}
                type="text"
                placeholder="Enter The Price Of Fuel (€/L)"
              />
              <Button variant="primary" onClick={searchLowestTotalAnnualCost}>
                Search
              </Button>
            </div>
            <Table striped bordered hover size="sm">
              <thead>
                <tr>                  
                  <th>Make</th>
                  <th>Model</th>
                  <th>Year Of Release</th>
                  <th>Price (€)</th>
                  <th>Fuel Consumption (km/l)</th>
                  <th>Annual Maintenance Cost (€)</th>
                  <th>Version</th>
                  <th>Calculated 4 Years Total Cost (€)</th>
                </tr>
              </thead>
              <tbody>
                {searchResult2.map((e: LowestTotalAnnualCostInformation,i:Number) => {
                  return (
                    <tr>                      
                      <td>{e.getMake()}</td>
                      <td>{e.getModel()}</td>
                      <td>{e.getYearofrelease()}</td>
                      <td>{e.getPrice()}</td>
                      <td>{e.getFuelconsumption()}</td>
                      <td>{e.getAnnualmaintenancecost()}</td>
                      <td>{e.getVersion()}</td>
                      <td>{e.getTotalannualcost()}</td>
                    </tr>
                  );
                })}
              </tbody>
            </Table>
          </Card.Body>
        </Card>
      
      </Tab>

    </Tabs>
  );
}

export default App;
