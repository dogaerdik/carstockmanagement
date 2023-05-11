import * as jspb from 'google-protobuf'



export class CarInformation extends jspb.Message {
  getModel(): string;
  setModel(value: string): CarInformation;

  getMake(): string;
  setMake(value: string): CarInformation;

  getVersion(): string;
  setVersion(value: string): CarInformation;

  getYearofrelease(): number;
  setYearofrelease(value: number): CarInformation;

  getPrice(): number;
  setPrice(value: number): CarInformation;

  getFuelconsumption(): number;
  setFuelconsumption(value: number): CarInformation;

  getAnnualmaintenancecost(): number;
  setAnnualmaintenancecost(value: number): CarInformation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CarInformation.AsObject;
  static toObject(includeInstance: boolean, msg: CarInformation): CarInformation.AsObject;
  static serializeBinaryToWriter(message: CarInformation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CarInformation;
  static deserializeBinaryFromReader(message: CarInformation, reader: jspb.BinaryReader): CarInformation;
}

export namespace CarInformation {
  export type AsObject = {
    model: string,
    make: string,
    version: string,
    yearofrelease: number,
    price: number,
    fuelconsumption: number,
    annualmaintenancecost: number,
  }
}

export class CarSaveRequest extends jspb.Message {
  getCarinformation(): CarInformation | undefined;
  setCarinformation(value?: CarInformation): CarSaveRequest;
  hasCarinformation(): boolean;
  clearCarinformation(): CarSaveRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CarSaveRequest.AsObject;
  static toObject(includeInstance: boolean, msg: CarSaveRequest): CarSaveRequest.AsObject;
  static serializeBinaryToWriter(message: CarSaveRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CarSaveRequest;
  static deserializeBinaryFromReader(message: CarSaveRequest, reader: jspb.BinaryReader): CarSaveRequest;
}

export namespace CarSaveRequest {
  export type AsObject = {
    carinformation?: CarInformation.AsObject,
  }
}

export class CarSaveResponse extends jspb.Message {
  getCarinformation(): CarInformation | undefined;
  setCarinformation(value?: CarInformation): CarSaveResponse;
  hasCarinformation(): boolean;
  clearCarinformation(): CarSaveResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CarSaveResponse.AsObject;
  static toObject(includeInstance: boolean, msg: CarSaveResponse): CarSaveResponse.AsObject;
  static serializeBinaryToWriter(message: CarSaveResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CarSaveResponse;
  static deserializeBinaryFromReader(message: CarSaveResponse, reader: jspb.BinaryReader): CarSaveResponse;
}

export namespace CarSaveResponse {
  export type AsObject = {
    carinformation?: CarInformation.AsObject,
  }
}

export class SearchRequest extends jspb.Message {
  getMake(): string;
  setMake(value: string): SearchRequest;

  getYearofrelease(): number;
  setYearofrelease(value: number): SearchRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SearchRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SearchRequest): SearchRequest.AsObject;
  static serializeBinaryToWriter(message: SearchRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SearchRequest;
  static deserializeBinaryFromReader(message: SearchRequest, reader: jspb.BinaryReader): SearchRequest;
}

export namespace SearchRequest {
  export type AsObject = {
    make: string,
    yearofrelease: number,
  }
}

export class SearchResponse extends jspb.Message {
  getCarinformationlistList(): Array<CarInformation>;
  setCarinformationlistList(value: Array<CarInformation>): SearchResponse;
  clearCarinformationlistList(): SearchResponse;
  addCarinformationlist(value?: CarInformation, index?: number): CarInformation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SearchResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SearchResponse): SearchResponse.AsObject;
  static serializeBinaryToWriter(message: SearchResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SearchResponse;
  static deserializeBinaryFromReader(message: SearchResponse, reader: jspb.BinaryReader): SearchResponse;
}

export namespace SearchResponse {
  export type AsObject = {
    carinformationlistList: Array<CarInformation.AsObject>,
  }
}

export class LowestTotalAnnualCostRequest extends jspb.Message {
  getExpecteddistance(): number;
  setExpecteddistance(value: number): LowestTotalAnnualCostRequest;

  getPriceoffuel(): number;
  setPriceoffuel(value: number): LowestTotalAnnualCostRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LowestTotalAnnualCostRequest.AsObject;
  static toObject(includeInstance: boolean, msg: LowestTotalAnnualCostRequest): LowestTotalAnnualCostRequest.AsObject;
  static serializeBinaryToWriter(message: LowestTotalAnnualCostRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LowestTotalAnnualCostRequest;
  static deserializeBinaryFromReader(message: LowestTotalAnnualCostRequest, reader: jspb.BinaryReader): LowestTotalAnnualCostRequest;
}

export namespace LowestTotalAnnualCostRequest {
  export type AsObject = {
    expecteddistance: number,
    priceoffuel: number,
  }
}

export class LowestTotalAnnualCostInformation extends jspb.Message {
  getModel(): string;
  setModel(value: string): LowestTotalAnnualCostInformation;

  getMake(): string;
  setMake(value: string): LowestTotalAnnualCostInformation;

  getVersion(): string;
  setVersion(value: string): LowestTotalAnnualCostInformation;

  getYearofrelease(): number;
  setYearofrelease(value: number): LowestTotalAnnualCostInformation;

  getPrice(): number;
  setPrice(value: number): LowestTotalAnnualCostInformation;

  getFuelconsumption(): number;
  setFuelconsumption(value: number): LowestTotalAnnualCostInformation;

  getAnnualmaintenancecost(): number;
  setAnnualmaintenancecost(value: number): LowestTotalAnnualCostInformation;

  getTotalannualcost(): number;
  setTotalannualcost(value: number): LowestTotalAnnualCostInformation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LowestTotalAnnualCostInformation.AsObject;
  static toObject(includeInstance: boolean, msg: LowestTotalAnnualCostInformation): LowestTotalAnnualCostInformation.AsObject;
  static serializeBinaryToWriter(message: LowestTotalAnnualCostInformation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LowestTotalAnnualCostInformation;
  static deserializeBinaryFromReader(message: LowestTotalAnnualCostInformation, reader: jspb.BinaryReader): LowestTotalAnnualCostInformation;
}

export namespace LowestTotalAnnualCostInformation {
  export type AsObject = {
    model: string,
    make: string,
    version: string,
    yearofrelease: number,
    price: number,
    fuelconsumption: number,
    annualmaintenancecost: number,
    totalannualcost: number,
  }
}

export class LowestTotalAnnualCostResponse extends jspb.Message {
  getLowesttotalannualcostlistList(): Array<LowestTotalAnnualCostInformation>;
  setLowesttotalannualcostlistList(value: Array<LowestTotalAnnualCostInformation>): LowestTotalAnnualCostResponse;
  clearLowesttotalannualcostlistList(): LowestTotalAnnualCostResponse;
  addLowesttotalannualcostlist(value?: LowestTotalAnnualCostInformation, index?: number): LowestTotalAnnualCostInformation;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LowestTotalAnnualCostResponse.AsObject;
  static toObject(includeInstance: boolean, msg: LowestTotalAnnualCostResponse): LowestTotalAnnualCostResponse.AsObject;
  static serializeBinaryToWriter(message: LowestTotalAnnualCostResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LowestTotalAnnualCostResponse;
  static deserializeBinaryFromReader(message: LowestTotalAnnualCostResponse, reader: jspb.BinaryReader): LowestTotalAnnualCostResponse;
}

export namespace LowestTotalAnnualCostResponse {
  export type AsObject = {
    lowesttotalannualcostlistList: Array<LowestTotalAnnualCostInformation.AsObject>,
  }
}

