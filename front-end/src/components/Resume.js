import React, { Component } from 'react';
import { Document, Page } from 'react-pdf';

class Resume extends Component {
	render() {
		return (
		  <div>
			<iframe title="file" style={{ width: '100vw', height: '100vh' }} src={'/resume.pdf'}/>
		  </div>
		);
	}
}

export default Resume;