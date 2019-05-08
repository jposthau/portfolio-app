import React, { Component } from 'react';
import PDFViewer from './PDFViewer'
import PDFJSBackend from '../backends/pdfjs'

class Resume extends Component {
	 	
	render() {
		return (
			<PDFViewer
				backend={PDFJSBackend}
				src='/resume.pdf'
			/>
		);
	}
}

export default Resume;
