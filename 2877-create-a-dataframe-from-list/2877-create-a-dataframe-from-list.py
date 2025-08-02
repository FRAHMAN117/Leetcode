import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    df= pd.DataFrame(student_data)
    columns=['student_id', 'age']
    result= pd.DataFrame(student_data, columns= columns)
    return result